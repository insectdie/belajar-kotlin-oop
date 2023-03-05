package app

import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException


fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.members
}

//fun validateRequest(request: CreateCategoryRequest) {
//    if (request.id == "") {
//        throw ValidationException("id is blank")
//    } else if (request.name == ""){
//        throw ValidationException("name is blank")
//    }
//}