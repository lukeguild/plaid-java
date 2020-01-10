package com.plaid.client.response;

/**
 * Response from /processor/token/create endpoint.
 */
public final class ItemProcessorTokenCreateResponse extends BaseResponse {
  private String processorToken;

  public String getProcessorToken() {
    return processorToken;
  }
}
