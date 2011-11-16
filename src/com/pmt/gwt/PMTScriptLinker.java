package com.pmt.gwt;

import java.util.Collection;
import java.util.Set;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.linker.Artifact;
import com.google.gwt.core.ext.linker.ArtifactSet;
import com.google.gwt.core.ext.linker.CompilationResult;
import com.google.gwt.core.ext.linker.EmittedArtifact;
import com.google.gwt.core.ext.linker.LinkerOrder;
import com.google.gwt.core.ext.linker.LinkerOrder.Order;
import com.google.gwt.core.ext.linker.Shardable;
import com.google.gwt.core.ext.linker.impl.SelectionScriptLinker;
import com.google.gwt.dev.util.DefaultTextOutput;

@LinkerOrder(Order.PRIMARY)
@Shardable
public class PMTScriptLinker extends SelectionScriptLinker {
	@Override
	public String getDescription() {
		return "PMT single script";
	}

	@Override
	public ArtifactSet link(TreeLogger logger, LinkerContext context, ArtifactSet artifacts, boolean onePermutation) throws UnableToCompleteException {
		if (onePermutation) {
			permutationsUtil.setupPermutationsMap(artifacts);
			ArtifactSet toReturn = new ArtifactSet(artifacts);
			toReturn.add(emitSelectionScript(logger, context, artifacts));
			for (EmittedArtifact artifact : toReturn.find(EmittedArtifact.class))
				if (artifact.getPartialPath().endsWith(".symbolMap"))
					toReturn.remove(artifact);
			return toReturn;
		} else {
			for (EmittedArtifact artifact : artifacts.find(EmittedArtifact.class))
				if (artifact.getPartialPath().endsWith(".symbolMap"))
					artifacts.remove(artifact);
			return artifacts;
		}
	}

	@Override
	protected Collection<Artifact<?>> doEmitCompilation(TreeLogger logger, LinkerContext context, CompilationResult result, ArtifactSet artifacts) throws UnableToCompleteException {
		if (result.getJavaScript().length != 1) {
			logger.branch(TreeLogger.ERROR, "The module must not have multiple fragments when using the " + getDescription() + " Linker.", null);
			throw new UnableToCompleteException();
		}
		return super.doEmitCompilation(logger, context, result, artifacts);
	}

	@Override
	protected EmittedArtifact emitSelectionScript(TreeLogger logger, LinkerContext context, ArtifactSet artifacts) throws UnableToCompleteException {

		DefaultTextOutput out = new DefaultTextOutput(true);

		out.print("(function () {");
		out.newlineOpt();
		out.print("var $stats = null;");
		out.newlineOpt();

		// Find the single CompilationResult
		Set<CompilationResult> results = artifacts.find(CompilationResult.class);
		if (results.size() != 1) {
			logger.log(TreeLogger.ERROR, "The module must have exactly one distinct" + " permutation when using the " + getDescription() + " Linker.", null);
			throw new UnableToCompleteException();
		}
		CompilationResult result = results.iterator().next();

		String[] js = result.getJavaScript();
		if (js.length != 1) {
			logger.log(TreeLogger.ERROR, "The module must not have multiple fragments when using the " + getDescription() + " Linker.", null);
			throw new UnableToCompleteException();
		}
		out.print(js[0]);
		out.newlineOpt();
		out.print("gwtOnLoad();");
		out.newlineOpt();
		out.print("})();");
		out.newlineOpt();

		return emitString(logger, out.toString(), "app.js");
	}

	/**
	 * Unimplemented. Normally required by
	 * {@link #doEmitCompilation(TreeLogger, LinkerContext, CompilationResult, ArtifactSet)}
	 * .
	 */
	@Override
	protected String getCompilationExtension(TreeLogger logger, LinkerContext context) throws UnableToCompleteException {
		throw new UnableToCompleteException();
	}

	/**
	 * Unimplemented. Normally required by
	 * {@link #doEmitCompilation(TreeLogger, LinkerContext, CompilationResult, ArtifactSet)}
	 * .
	 */
	@Override
	protected String getModulePrefix(TreeLogger logger, LinkerContext context, String strongName) throws UnableToCompleteException {
		throw new UnableToCompleteException();
	}

	/**
	 * Unimplemented. Normally required by
	 * {@link #doEmitCompilation(TreeLogger, LinkerContext, CompilationResult, ArtifactSet)}
	 * .
	 */
	@Override
	protected String getModuleSuffix(TreeLogger logger, LinkerContext context) throws UnableToCompleteException {
		throw new UnableToCompleteException();
	}

	@Override
	protected String getSelectionScriptTemplate(TreeLogger logger, LinkerContext context) throws UnableToCompleteException {
		return "com/gwt/pmt/pmt.js";
	}
}
