package com.airbnb.lottie;

import android.Manifest;
import android.os.Build;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.rule.GrantPermissionRule;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;
import android.util.Log;

import com.airbnb.happo.HappoRunner;
import com.airbnb.lottie.samples.MainActivity;
import com.airbnb.lottie.samples.TestColorFilterActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Run these with: ./gradlew recordMode screenshotTests
 * If you run that command, it completes successfully, and nothing shows up in git, then you
 * haven't broken anything!
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class LottieTest {
  @Rule public final ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<>(
      MainActivity.class);

  @Rule public ActivityTestRule<TestColorFilterActivity> colorFilterActivityRule =
      new ActivityTestRule<>(TestColorFilterActivity.class);

  @Rule
  public GrantPermissionRule permissionRule = GrantPermissionRule.grant(
      Manifest.permission.WRITE_EXTERNAL_STORAGE,
      Manifest.permission.READ_EXTERNAL_STORAGE
  );

}
