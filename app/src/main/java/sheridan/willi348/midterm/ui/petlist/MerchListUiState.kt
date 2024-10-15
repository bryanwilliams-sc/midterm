package sheridan.willi348.midterm.ui.petlist

import sheridan.willi348.midterm.domain.Merch

sealed interface MerchListUiState {
    data class Loaded(val merchList: List<Merch>):MerchListUiState
}