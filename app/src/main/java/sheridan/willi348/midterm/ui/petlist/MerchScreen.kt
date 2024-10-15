package sheridan.willi348.midterm.ui.petlist

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import sheridan.willi348.midterm.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MerchScreen(
    modifier: Modifier = Modifier,
    viewModel: MerchListViewModel = viewModel()
){
    val state: State<MerchListUiState> = viewModel.uiState
    val uiState: MerchListUiState = state.value

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()

    Scaffold(modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            MerchDataTopAppBar(
                title = stringResource(R.string.list_title),
                canNavigateBack = false,
                scrollBehavior = scrollBehavior
            )
        }
    ) { innerPadding ->
        when (uiState) {
            is MerchListUiState.Loaded -> ListBody(
                merchList = uiState.merchList,
                modifier = modifier.padding(innerPadding)
            )
        }
    }
}

