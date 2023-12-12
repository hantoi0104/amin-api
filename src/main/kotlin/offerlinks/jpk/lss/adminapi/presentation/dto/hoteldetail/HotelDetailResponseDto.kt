package offerlinks.jpk.lss.adminapi.presentation.dto.hoteldetail

import io.swagger.v3.oas.annotations.media.Schema
import offerlinks.jpk.lss.adminapi.presentation.dto.ResponseResult

@Schema(description = "ホテル詳細応答")
data class HotelDetailResponseDto(
    @get:Schema(
        description = "IFの実行結果を設定する要素",
        required = true
    )
    val result: ResponseResult,

    @get:Schema(
        description = "ホテル",
        required = false
    )
    val hotel: HotelDto?
)
