package offerlinks.jpk.lss.adminapi.presentation.dto.planupdate

import io.swagger.v3.oas.annotations.media.Schema
import offerlinks.jpk.lss.adminapi.presentation.dto.ResponseResult
import java.time.LocalDateTime

data class PlanUpdateResponseDto (
    @get:Schema(
        description = "IFの実行結果を設定する要素",
        required = true
    )
    val result: ResponseResult,

    @get:Schema(
        description = "最終更新日時",
    )
    val updatedDatetime: LocalDateTime?
)
