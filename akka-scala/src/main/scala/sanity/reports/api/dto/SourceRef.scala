/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package sanity.reports.api.dto

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime

case class SourceRef (
  file: Option[String],
  line: Option[Int]
) extends ApiModel


