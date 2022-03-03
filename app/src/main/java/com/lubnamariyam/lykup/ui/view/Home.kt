package com.lubnamariyam.lykup.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.lubnamariyam.lykup.R
import com.lubnamariyam.lykup.ui.theme.Purple200
import com.lubnamariyam.lykup.ui.theme.Purple500

@Composable
fun HomeScreen(navController: NavController) {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {},
        content = {},
        bottomBar = {}
    )
}

@Composable
fun TopBar() {
    TopAppBar(
        title = {
            Text(text = "LYKUP",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Purple500,
                fontFamily = FontFamily.SansSerif)
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(Icons.Filled.Menu, "Navigation", tint = Purple500)
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = com.lubnamariyam.lykup.R.drawable.ic_baseline_shopping_cart_24),
                    contentDescription = null, tint = Purple500
                )
            }
        },
        backgroundColor = Color.White,
        contentColor = Purple200,
        elevation = 10.dp
    )
}

@Composable
fun BottomBar(navController: NavController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp, modifier = Modifier.height(56.dp).background(Color.White), contentColor = Purple200, backgroundColor = Color.White) {
        BottomNavigationItem(icon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_home_24),
                contentDescription = null,
                modifier = Modifier.padding(bottom = 2.dp)
            )
        },
            label = { Text(text = "Home") },
            selected = (selectedIndex.value == 0),
            onClick = {
                selectedIndex.value = 0
                navController.navigate("home_screen")
            })

        BottomNavigationItem(icon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_explore_24),
                contentDescription = null,
                modifier = Modifier.padding(bottom = 2.dp)
            )
        },

            label = { Text(text = "Explore") },
            selected = (selectedIndex.value == 1),
            onClick = {
                selectedIndex.value = 1
                //navController.navigate("search_screen")
            })

        BottomNavigationItem(icon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_notifications_none_24),
                contentDescription = null,
                modifier = Modifier.padding(bottom = 2.dp)
            )
        },
            label = { Text(text = "Notification") },
            selected = (selectedIndex.value == 2),
            onClick = {
                selectedIndex.value = 2
            })

        BottomNavigationItem(icon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_person_outline_24),
                contentDescription = null,
                modifier = Modifier.padding(bottom = 2.dp)
            )
        },
            label = { Text(text = "Account") },
            selected = (selectedIndex.value == 3),
            onClick = {
                selectedIndex.value = 3
            })
    }
}

@Composable
fun HomeContent(){

    println("")
}