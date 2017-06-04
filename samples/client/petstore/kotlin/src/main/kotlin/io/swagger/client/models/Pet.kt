/**
* Swagger Petstore
* This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
*
* OpenAPI spec version: 1.0.0
* Contact: apiteam@swagger.io
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models

import io.swagger.client.models.Category
import io.swagger.client.models.Tag

/**
 * A pet for sale in the pet store
 * @param id 
 * @param category 
 * @param name 
 * @param photoUrls 
 * @param tags 
 * @param status pet status in the store
 */
data class Pet (
    val name: kotlin.String,
    val photoUrls: kotlin.collections.List<kotlin.String>,
    val id: kotlin.Long? = null,
    val category: Category? = null,
    val tags: kotlin.collections.List<Tag>? = null,
    /* pet status in the store */
    val status: Pet.Status? = null
) {

    enum class Status(val value: kotlin.String) {
        available("available"),
        pending("pending"),
        sold("sold");
    }


}
