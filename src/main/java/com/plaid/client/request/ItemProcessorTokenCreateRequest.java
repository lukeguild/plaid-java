package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for  /processor/token/create endpoint.
 */
public final class ItemProcessorTokenCreateRequest extends BaseAccessTokenRequest {
  private String accountId;
  private String processor;

  public ItemProcessorTokenCreateRequest(String accessToken, String accountId, String processor) {
    super(accessToken);
    this.accountId = accountId;
    this.processor = processor;
  }
}
