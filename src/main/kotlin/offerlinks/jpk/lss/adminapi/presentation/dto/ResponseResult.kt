package offerlinks.jpk.lss.adminapi.presentation.dto

import io.swagger.v3.oas.annotations.media.Schema
import offerlinks.jpk.lss.adminapi.domain.model.ResponseType

@Schema(description = "IFの実行結果を設定する要素")
data class ResponseResult(
    @get:Schema(
        description = "実行結果のステータス",
        required = true,
        enumAsRef = true,
        example = "OK"
    )
    val status: ResponseType,
    @get:Schema(
        description = "エラー発生時のメッセージID",
        required = false,
        example = "MSGE00001"
    )
    val messageId: String?,
    @get:Schema(
        description = "エラー発生時のメッセージ",
        required = false,
        example = "GA011_プラン情報検索APIを呼時、エラーが発生しました。"
    )
    val message: String?
)
