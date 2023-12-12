package offerlinks.jpk.lss.adminapi.presentation.dto.hotelequipment

import io.swagger.v3.oas.annotations.media.Schema
import offerlinks.jpk.lss.adminapi.presentation.dto.ResponseResult

@Schema(description = "ホテル設備・施設マッピング詳細応答")
data class HotelEquipmentDetailResponseDto (

    @get:Schema(
        description = "IFの実行結果を設定する要素",
        required = true
    )
    val result: ResponseResult,

    @get:Schema(
        description = "ホテル設備・施設マッピングリスト",
        required = false
    )
    val listHotelEquipment: List<HotelEquipmentDto>?
)