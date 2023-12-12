package offerlinks.jpk.lss.adminapi.presentation.dto.error

import io.swagger.v3.oas.annotations.media.Schema

data class FieldErrorDto(
    @get:Schema(
        description = "フィールド",
        required = false,
        example = "birthDate"
    )
    val field: String?,

    @get:Schema(
        description = "エラーメッセージ",
        required = false,
        example = "birthDateの形式はYYYY-MM-DDではありません。"
    )
    val message: String?
)
