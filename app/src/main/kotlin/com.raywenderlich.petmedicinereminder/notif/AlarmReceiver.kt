package com.raywenderlich.petmedicinereminder.notif

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.raywenderlich.petmedicinereminder.R
import com.raywenderlich.petmedicinereminder.data.DataUtils
import com.raywenderlich.petmedicinereminder.reminder.ReminderDialog

class AlarmReceiver: BroadcastReceiver(){

  override fun onReceive(context: Context?, intent: Intent?) {
    if (context != null && intent != null && intent.action != null) {
      if (intent.action!!.equals(context.getString(R.string.action_notify_administer_medication)
                      , ignoreCase = true)) {
        if (intent.extras != null) {
          val reminderData = DataUtils.getReminderById(intent.extras!!.getInt(ReminderDialog.KEY_ID))
          if (reminderData != null) {
            NotificationHelper.createNotificationForPet(context, reminderData)
          }
        }
      }
    }
  }
}