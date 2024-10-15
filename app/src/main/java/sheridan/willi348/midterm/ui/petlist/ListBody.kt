package sheridan.willi348.midterm.ui.petlist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sheridan.willi348.midterm.R
import sheridan.willi348.midterm.domain.Merch

@Composable
fun ListBody(
    merchList: List<Merch>,
    modifier: Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 8.dp, horizontal = 16.dp
        ), modifier = modifier
    ) {
        items(merchList) { pet ->
            MerchListItem(pet)
        }
    }

}

@Composable
fun MerchListItem(item: Merch) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(10.dp)
        ){
            Image(
                painter = painterResource(item.image),
                contentDescription = "${item.type} ${item.color}"
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ){
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    Text(
                        text = item.gender,
                        fontSize = 28.sp
                    )
                    Text(
                        text = item.type,
                        fontSize = 28.sp
                    )
                }
                Text(
                    text = item.color,
                    fontSize = 24.sp
                )
                Text(
                    text = "$" + item.price,
                    fontSize = 24.sp
                )
            }
        }
    }
}

