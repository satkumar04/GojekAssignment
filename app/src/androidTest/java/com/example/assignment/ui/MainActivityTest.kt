package com.example.assignment.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.*
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeDown
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.example.assignment.R
import org.hamcrest.Matchers
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {
    @get:Rule
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)
    private var mIdlingResource: IdlingResource?=null
    @Before
    fun setup()
    {
        mIdlingResource = mActivityTestRule.activity.countingIdlingResource
        IdlingRegistry.getInstance().register(mIdlingResource)
    }

    @Test
    fun displayRepoData() {
        onView(withId(R.id.rv_main_home)).check(
            matches(
                isDisplayed()
            )
        )
        onView(withId(R.id.shimmer_view_container)).check(
            matches(
                Matchers.not(
                    isDisplayed()
                ))
        )
    }

    //Error state check,
    /*@Test
    fun displayErrorState() {
        onView(withId(R.id.errorLayout)).check(
            matches(
                isDisplayed()
            )
        )
        onView(withId(R.id.rv_dataLayout)).check(
            matches(
                Matchers.not(
                    isDisplayed()
                ))
        )
    }*/

    @Test
    fun testPullToRefresh()
    { //Before refresh there is a list .
        onView(withId(R.id.rv_main_home)).check(matches(isDisplayed()))
        onView(withId(R.id.shimmer_view_container)).check(matches(Matchers.not(isDisplayed())))
        // pull to refresh .
        onView(withId(R.id.rv_main_home)).perform(swipeDown())
        //after refresh there is a list.
        onView(withId(R.id.rv_main_home)).check(matches(isDisplayed()))
        onView(withId(R.id.shimmer_view_container)).check(matches(Matchers.not(isDisplayed())))
    }

    @Test
    fun testOnItemClick() {
        onView(withId(R.id.rv_main_home)).perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
            click()))
        val itemElementText = "Foodium"
        onView(withText(itemElementText)).check(matches(isDisplayed()))



    }

    @After
    fun unregisterIdlingResource() {
        if (this.mIdlingResource != null) {
            IdlingRegistry.getInstance().unregister()
        }
    }


}
