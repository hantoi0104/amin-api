package offerlinks.jpk.lss.adminapi.presentation.dto.hoteldelete

import io.swagger.v3.oas.annotations.media.Schema
import offerlinks.jpk.lss.adminapi.presentation.dto.ResponseResult

@Schema(description = "'ホテル情報削除応答")
data class HotelDeleteResponseDto(
    @get:Schema(
        description = "IFの実行結果を設定する要素",
        required = true
    )
    val result: ResponseResult
)
