# android-notification-textinput

# Packages for Notification:

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import android.app.NotificationChannel;
import android.app.NotificationManager;

# Class: NotificationChannel
# Method: 
NotificationChannel(NOTIFICATION_CHANNEL_ID, name , importance);

# Class: NotificationManager
# Method: 
createNotificationChannel(channel);

# Class: NotificationManagerCompat
# Method: 
notify(notificationId, notifybuilder.build());
setSmallIcon(R.drawable.ic_notification)
setContentTitle( NotifyContent.title)
setContentText(NotifyContent.content)
setPriority(NotificationCompat.PRIORITY_MAX)
setWhen(System.currentTimeMillis());

