package com.alex.gimenes.apps.composecomponents.home

import androidx.annotation.StringRes
import com.alex.gimenes.apps.composecomponents.R

enum class Categories(
    @StringRes val categoryName: Int,
) {
    BUTTON(categoryName = R.string.categories_button),
    CARD_VIEW(categoryName = R.string.categories_card_view)
}