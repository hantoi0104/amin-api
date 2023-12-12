package offerlinks.jpk.lss.adminapi.presentation.dto.plandetail

import io.swagger.v3.oas.annotations.media.Schema
import offerlinks.jpk.lss.adminapi.presentation.dto.ResponseResult

data class PlanDetailResponseDto (
    @get:Schema(
        description = "IFの実行結果を設定する要素",
        required = true
    )
    val result: ResponseResult,

    @get:Schema(
        description = "プラン",
        required = false
    )
    val plan: PlanDto?
)