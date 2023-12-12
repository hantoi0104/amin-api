package offerlinks.jpk.lss.adminapi.presentation.api

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.validation.Valid
// import jakarta.validation.constraints.NotNull
// import offerlinks.jpk.lss.adminapi.domain.model.ResponseType
// import offerlinks.jpk.lss.adminapi.presentation.dto.ResponseResult
import offerlinks.jpk.lss.adminapi.presentation.dto.error.BadRequestErrorDto
// import offerlinks.jpk.lss.adminapi.presentation.dto.hoteldelete.HotelDeleteRequestDto
// import offerlinks.jpk.lss.adminapi.presentation.dto.hoteldelete.HotelDeleteResponseDto
// import offerlinks.jpk.lss.adminapi.presentation.dto.hoteldetail.HotelDetailResponseDto
// import offerlinks.jpk.lss.adminapi.presentation.dto.hoteldetail.HotelDto
import offerlinks.jpk.lss.adminapi.presentation.dto.hotelupdate.HotelUpdateRequestDto
import offerlinks.jpk.lss.adminapi.presentation.dto.hotelupdate.HotelUpdateResponseDto
import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
// import org.springframework.web.bind.annotation.DeleteMapping
// import org.springframework.web.bind.annotation.GetMapping
// import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
// import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
// import java.util.UUID

@Tag(name = "ホテル管理")
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
class HotelApi {
    private val logger = LoggerFactory.getLogger(this::class.java)

    // @Operation(
    //     summary = "ホテル参照情報取得API",
    //     description = "ホテルテーブルからホテル詳細情報を取得する。"
    // )
    // @GetMapping(
    //     "/hotel/{hotel_id}",
    //     produces = [MediaType.APPLICATION_JSON_VALUE]
    // )
    // fun getHotelDetail(
    //     @PathVariable(name = "hotel_id")
    //     @Schema(description = "ホテルID")
    //     @Valid
    //     @NotNull
    //     hotelId: UUID
    // ): HotelDetailResponseDto? {
    //     return null
    // }

    // @Operation(
    //     summary = "ホテル情報削除API",
    //     description = "ホテルテーブルからホテルを削除する。"
    // )
    // @DeleteMapping(
    //     "/hotel",
    //     produces = [MediaType.APPLICATION_JSON_VALUE]
    // )
    // fun deleteHotel(
    //     @Valid @RequestBody
    //     request: HotelDeleteRequestDto
    // ): HotelDeleteResponseDto? {
    //     return null
    // }

    @Operation(
        summary = "ホテル情報更新API",
        description = "ホテル情報をホテルテーブルに更新する。"
    )
    @PutMapping(
        "/hotel",
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun updateHotel(
        @Valid @RequestBody
        request: HotelUpdateRequestDto
    ): HotelUpdateResponseDto? {
        return null
    }
}
