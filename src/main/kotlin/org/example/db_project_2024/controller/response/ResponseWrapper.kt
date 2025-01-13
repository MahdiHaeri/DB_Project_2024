package org.example.db_project_2024.controller.response

import org.example.db_project_2024.enums.ResponseStatusEnum
import com.fasterxml.jackson.annotation.JsonInclude
import org.springframework.data.domain.Page

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ResponseWrapper<T>(
    val status: ResponseStatusEnum = ResponseStatusEnum.OK,
    val result: T,
)

@JsonInclude(JsonInclude.Include.NON_NULL)
data class EmptyResponse(
    val status: ResponseStatusEnum = ResponseStatusEnum.OK,
)


@JsonInclude(JsonInclude.Include.NON_NULL)
data class PaginationResponseWrapper<T>(
    val status: ResponseStatusEnum = ResponseStatusEnum.OK,
    val result: Result<T>,
) {
    data class Result<T>(
        val page: Int,
        val perPage: Int,
        val totalItems: Long,
        val totalPages: Int,
        val data: List<T>
    )

    companion object {
        fun <T> fromPageResult(page: Page<T>): PaginationResponseWrapper<T> {
            return PaginationResponseWrapper(
                status = ResponseStatusEnum.OK,
                result = Result(
                    page = page.pageable.pageNumber,
                    perPage = page.pageable.pageSize,
                    totalItems = page.totalElements,
                    totalPages = page.totalPages,
                    data = page.content,
                )
            )
        }
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
data class CursorBasedResponseWrapper<T>(
    val status: ResponseStatusEnum = ResponseStatusEnum.OK,
    val result: Result<T>,
) {
    data class Result<T>(
        val hasNext: Boolean,
        val data: List<T>,
    )
}
