/*
 * Copyright (c) 2019 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.raywenderlich.petmedicinereminder.notif

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import android.support.v4.app.NotificationCompat
import android.support.v4.app.NotificationManagerCompat
import com.raywenderlich.petmedicinereminder.AppGlobalReceiver
import com.raywenderlich.petmedicinereminder.MainActivity
import com.raywenderlich.petmedicinereminder.R
import com.raywenderlich.petmedicinereminder.data.ReminderData
import com.raywenderlich.petmedicinereminder.reminder.ReminderDialog

object NotificationHelper {

  private const val ADMINISTER_REQUEST_CODE = 2019

  /**
   * Sets up the notification channels for API 26+.
   * Note: This uses package name + channel name to create unique channelId's.
   *
   * @param context     application context
   * @param importance  importance level for the notificaiton channel
   * @param showBadge   whether the channel should have a notification badge
   * @param name        name for the notification channel
   * @param description description for the notification channel
   */
  fun createNotificationChannel(context: Context, importance: Int, showBadge: Boolean, name: String, description: String) {

  }

  /**
   * Helps issue the default application channels (package name + app name) notifications.
   * Note: this shows the use of [NotificationCompat.BigTextStyle] for expanded notifications.
   *
   * @param context    current application context
   * @param title      title for the notification
   * @param message    content text for the notification when it's not expanded
   * @param bigText    long form text for the expanded notification
   * @param autoCancel `true` or `false` for auto cancelling a notification.
   * if this is true, a [PendingIntent] is attached to the notification to
   * open the application.
   */
  fun createSampleDataNotification(context: Context, title: String, message: String,
                                   bigText: String, autoCancel: Boolean) {

  }

  /**
   * Creates a notification for [ReminderData] with a full notification tap and a single action.
   *
   * @param context      current application context
   * @param reminderData ReminderData for this notification
   */

  fun createNotificationForPet(context: Context, reminderData: ReminderData) {

  }

  /**
   * Builds and returns the [NotificationCompat.Builder] for the group notification for a pet type.
   *
   * @param context current application context
   * @param reminderData ReminderData for this notification
   */
  private fun buildGroupNotification(context: Context, reminderData: ReminderData): NotificationCompat.Builder? {
    return null
  }

  /**
   * Builds and returns the NotificationCompat.Builder for the Pet notification.
   *
   * @param context current application context
   * @param reminderData ReminderData for this notification
   */
  private fun buildNotificationForPet(context: Context, reminderData: ReminderData): NotificationCompat.Builder? {
    return null
  }

  /**
   * Creates the pending intent for the Administered Action for the pet notification.
   *
   * @param context current application context
   * @param reminderData ReminderData for this notification
   */
  private fun createPendingIntentForAction(context: Context, reminderData: ReminderData): PendingIntent? {
    return null
  }
}