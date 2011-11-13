package com.pmt.database;

import java.util.ArrayList;

public class Query {

	private enum State {
		NONE, BIND_FIRST, BIND_REST, STRING_SINGLE, STRING_DOUBLE
	};

	public static ArrayList<String> process(String val) throws Exception {
		ArrayList<String> args = new ArrayList<String>();
		State state = State.NONE;
		int startIndex = -1;
		for (int i = 0; i < val.length(); i++) {
			char c = val.charAt(i);
			switch (state) {
			case NONE:
				switch (c) {
				case ':':
					state = State.BIND_FIRST;
					startIndex = i;
					break;
				case '\'':
					state = State.STRING_SINGLE;
					break;
				case '"':
					state = State.STRING_DOUBLE;
					break;
				}
				break;
			case BIND_FIRST:
				if (Character.isLetter(c) || c == '_') {
					state = State.BIND_REST;
					args.add(String.valueOf(c));
				} else
					throw new Exception("");
				break;
			case BIND_REST:
				if (Character.isLetterOrDigit(c) || c == '_' || c == '$') {
					args.set(args.size() - 1, args.get(args.size() - 1) + String.valueOf(c));
				} else {
					StringBuffer s = new StringBuffer(val);
					s.replace(startIndex, i, "?");
					val = s.toString();
					i = startIndex;
					state = State.NONE;
				}
				break;
			case STRING_SINGLE:
				if (c == '\'') {
					state = State.NONE;
				} else if (c == '\\') {
					i++;
				}
				break;
			case STRING_DOUBLE:
				if (c == '"') {
					state = State.NONE;
				} else if (c == '\\') {
					i++;
				}
				break;
			}
		}
		if (state == State.BIND_REST) {
			StringBuffer s = new StringBuffer(val);
			s.replace(startIndex, val.length(), "?");
			val = s.toString();
		} else if (state != State.NONE) {
			throw new Exception("");
		}
		System.out.println(val);
		return args;
	}
}
