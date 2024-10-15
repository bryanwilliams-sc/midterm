package sheridan.willi348.midterm.ui.petlist

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import sheridan.willi348.midterm.data.local.fakeMerchList

class MerchListViewModel : ViewModel() {

    private val _uiState: MutableState<MerchListUiState> =
        mutableStateOf(MerchListUiState.Loaded(fakeMerchList))
    val uiState: State<MerchListUiState> = _uiState
}

