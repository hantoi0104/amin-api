package offerlinks.jpk.lss.adminapi.presentation.api

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import offerlinks.jpk.lss.adminapi.presentation.dto.error.BadRequestErrorDto
// import offerlinks.jpk.lss.adminapi.presentation.dto.hoteldetail.HotelDetailResponseDto
import offerlinks.jpk.lss.adminapi.presentation.dto.hotelequipment.HotelEquipmentDetailResponseDto
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@Tag(name = "ホテル設備・施設マッピング管理")
@ApiResponses(
    value = [
        ApiResponse(responseCode = "200", description = "正常", useReturnTypeSchema = true),
        ApiResponse(
            responseCode = "400",
            description = "不正なリクエスト",
            content = [Content(schema = Schema(implementation = BadRequestErrorDto::class))]
        ),
        ApiResponse(
            responseCode = "404",
            description = "APIが見つからない",
            content = [Content(schema = Schema(hidden = true))]
        ),
        ApiResponse(
            responseCode = "500",
            description = "内部サーバーエラー",
            content = [Content(schema = Schema(hidden = true))]
        )
    ]
)
@RestController
@RequestMapping("/adminapi")
class HotelEquipmentApi {

    // @Operation(
    //     summary = "ホテルIDに一致する設備・施設一覧取得API",
    //     description = "ホテルIDに一致する設備・施設一覧取得API。"
    // )
    // @GetMapping(
    //     "/common-data/equipmentfacility/{hotel_id}",
    //     produces = [MediaType.APPLICATION_JSON_VALUE]
    // )
    // fun getHotelEquipmentDetail(
    //     @PathVariable(name = "hotel_id")
    //     @Schema(description = "ホテルID")
    //     @Valid
    //     @NotNull
    //     hotelId: UUID
    // ): HotelEquipmentDetailResponseDto? {
    //     return null
    // }
}