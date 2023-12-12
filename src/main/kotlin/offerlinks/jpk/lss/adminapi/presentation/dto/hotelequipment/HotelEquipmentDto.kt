package offerlinks.jpk.lss.adminapi.presentation.dto.hotelequipment

import io.swagger.v3.oas.annotations.media.Schema
import java.util.UUID

@Schema(description = "ホテル設備・施設マッピング")
data class HotelEquipmentDto (
    @get:Schema(
        description = "ホテルID"
    )
    val hotelId: UUID?,

    @get:Schema(
        description = "設備・施設ID"
    )
    val equipmentFacilityId: UUID?

)