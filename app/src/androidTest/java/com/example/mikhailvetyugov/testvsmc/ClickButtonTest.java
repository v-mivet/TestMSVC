package com.example.mikhailvetyugov.testvsmc;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ClickButtonTest {

    @Rule
    public ActivityTestRule<ItemListActivity> mActivityRule = new ActivityTestRule<>(
            ItemListActivity.class);

    @Before
    public void initValidString() {
    }

    @Test
    public void clickButton_sameActivity() {
        onView(withId(R.id.fab)).perform(click());
    }
}