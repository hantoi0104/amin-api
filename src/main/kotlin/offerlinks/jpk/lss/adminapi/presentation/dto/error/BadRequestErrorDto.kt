package offerlinks.jpk.lss.adminapi.presentation.dto.error

import io.swagger.v3.oas.annotations.media.Schema

data class BadRequestErrorDto(
    @get:Schema(
        description = "フィールドエラーDto",
        required = true
    )
    val errors: List<FieldErrorDto>
)
