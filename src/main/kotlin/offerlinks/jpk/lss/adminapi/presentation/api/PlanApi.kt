package offerlinks.jpk.lss.adminapi.presentation.api

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.parameters.RequestBody
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.validation.Valid
import offerlinks.jpk.lss.adminapi.presentation.dto.error.BadRequestErrorDto
import offerlinks.jpk.lss.adminapi.presentation.dto.planupdate.PlanUpdateRequestDto
import offerlinks.jpk.lss.adminapi.presentation.dto.planupdate.PlanUpdateResponseDto
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "プラン管理")
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
class PlanApi {
    //
    // @Operation(
    //     summary = "プラン情報削除API",
    //     description = "プランテーブルからホテルを削除する。"
    // )
    // @DeleteMapping(
    //     "/hotel/plan",
    //     produces = [MediaType.APPLICATION_JSON_VALUE]
    // )
    // fun deletePlan(
    //     @Valid @RequestBody
    //     request: PlanDeleteRequestDto
    // ): PlanDeleteResponseDto? {
    //     return null
    // }

    // @Operation(
    //     summary = "プラン詳細情報照会API",
    //     description = "プランテーブルからプラン詳細情報を照会する。"
    // )
    // @GetMapping(
    //     "/hotel/{hotel_id}/plan/{plan_id}",
    //     produces = [MediaType.APPLICATION_JSON_VALUE]
    // )
    // fun getPlanDetail(
    //     @PathVariable(name = "hotel_id")
    //     @Schema(description = "ホテルID")
    //     @Valid
    //     @NotNull
    //     hotelId: UUID,
    //
    //     @PathVariable(name = "plan_id")
    //     @Schema(description = "プランID")
    //     @Valid
    //     @NotNull
    //     planId: UUID,
    //
    // ): PlanDetailResponseDto? {
    //     return null
    // }


    // @Operation(
    //     summary = "プラン詳細情報変更AP",
    //     description = "プランテーブルにプラン詳細情報を変更する。"
    // )
    // @PutMapping(
    //     "/hotel/plan",
    //     produces = [MediaType.APPLICATION_JSON_VALUE]
    // )
    // fun updatePlan(
    //     @Valid @RequestBody
    //     request: PlanUpdateRequestDto
    // ): PlanUpdateResponseDto? {
    //     return null
    // }
}