package com.progress.codeshare.esbservice.scriptEngine;

import java.util.Iterator;

import com.sonicsw.xq.XQEnvelope;
import com.sonicsw.xq.XQInitContext;
import com.sonicsw.xq.XQService;
import com.sonicsw.xq.XQServiceContext;

public final class ScriptEngineService implements XQService {

	public void destroy() {
	}

	public void init(XQInitContext initCtx) {
	}

	public void service(final XQServiceContext servCtx) {

		while (servCtx.hasNextIncoming()) {
			final XQEnvelope env = servCtx.getNextIncoming();

			final Iterator addressIterator = env.getAddresses();

			if (addressIterator.hasNext())
				servCtx.addOutgoing(env);

		}

	}
}