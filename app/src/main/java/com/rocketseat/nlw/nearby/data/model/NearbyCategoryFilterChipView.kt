package com.rocketseat.nlw.nearby.data.model

import androidx.annotation.DrawableRes
import com.rocketseat.nlw.nearby.R

enum class NearbyCategoryFilterChipView(
    val description: String,
        @DrawableRes val icon: Int
) {
    ALIMENTACAO(description = "Alimentação", icon = R.drawable.ic_tools_kitchen_2),
    COMPRAS(description = "Compras", icon = R.drawable.ic_shopping_bag),
    HOSPEDAGEM(description = "Compras", icon = R.drawable.ic_shopping_bag),
    SUPERMERCADO(description = "Compras", icon = R.drawable.ic_shopping_bag),
    ENTRETENIMENTO(description = "Compras", icon = R.drawable.ic_shopping_bag),
    FARMACIA(description = "Compras", icon = R.drawable.ic_shopping_bag),
    COMBUSTIVEL(description = "Compras", icon = R.drawable.ic_shopping_bag),
    PADARIA(description = "Compras", icon = R.drawable.ic_shopping_bag),
}