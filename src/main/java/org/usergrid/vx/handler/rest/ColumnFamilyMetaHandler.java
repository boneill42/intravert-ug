package org.usergrid.vx.handler.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.usergrid.vx.experimental.IntraReq;
import org.usergrid.vx.experimental.Operations;
import org.vertx.java.core.Vertx;
import org.vertx.java.core.buffer.Buffer;
import org.vertx.java.core.http.HttpServerRequest;

/**
 * @author zznate
 */
public class ColumnFamilyMetaHandler extends IntraHandlerRest {

  private Logger log = LoggerFactory.getLogger(ColumnFamilyMetaHandler.class);

  public ColumnFamilyMetaHandler(Vertx vertx) {
    super(vertx);
  }

  @Override
  public void handleRequestAsync(final HttpServerRequest request, Buffer buffer) {

    log.debug("In ColumnFamilyMetaHandler#handleRequestAsync");

    IntraReq req = new IntraReq();

    req.add(Operations.listColumnFamilyOp(request.params().get("ks")));

    delegateAndReply(request, req);
  }
}
