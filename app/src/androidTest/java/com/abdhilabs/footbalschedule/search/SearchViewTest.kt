package com.abdhilabs.footbalschedule.search

import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.abdhilabs.footbalschedule.R.id.*
import com.abdhilabs.footbalschedule.ui.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SearchViewTest {

    @Rule
    @JvmField
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun homeTest() {
        delay(3000)
        onView(withId(item_search)).check(matches(isDisplayed()))
        onView(withId(item_search)).perform(click())
        delay()
        onView(withId(sv_match)).check(matches(isDisplayed()))
        delay()
        onView(withId(search_button)).perform(click())
        delay()
//        onView(withId(sv_match)).perform(typeText("barcelona"))
//            .perform(pressKey(KeyEvent.KEYCODE_ENTER))
//        delay()
        onView(isAssignableFrom(EditText::class.java)).perform(
            typeText("barcelona"),
            pressImeActionButton()
        )
        delay(5000)
        onView(withId(rv_list_search_match)).check(matches(isDisplayed()))
        onView(withId(rv_list_search_match)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                1
            )
        )
        onView(withId(rv_list_search_match)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                1,
                click()
            )
        )
        delay()

    }

    private fun delay(time: Long = 1500) {
        Thread.sleep(time)
    }
}