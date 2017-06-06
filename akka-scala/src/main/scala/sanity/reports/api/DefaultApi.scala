/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package sanity.reports.api

import sanity.reports.api.dto.ApiResponse
import sanity.reports.api.dto.Report
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object DefaultApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Report (Analysis complete)
   */
  def checkSingle(): ApiRequest[Report] =
    ApiRequest[Report](ApiMethods.POST, "https://virtserver.swaggerhub.com/okutane/sanity/1.0.0", "/checker/checkfile", "application/llvm-bc")
      .withSuccessResponse[Report](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : ApiResponse (Report is published)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   * 
   * @param body Report object that needs to be added to the store
   */
  def publishReport(body: Report)(implicit apiKey: ApiKeyValue): ApiRequest[ApiResponse] =
    ApiRequest[ApiResponse](ApiMethods.POST, "https://virtserver.swaggerhub.com/okutane/sanity/1.0.0", "/my/report", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withBody(body)
      .withSuccessResponse[ApiResponse](200)
      

}

