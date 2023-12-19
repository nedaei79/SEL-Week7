# آزمایش هفتم - آزمایشگاه مهندسی نرم‌افزار
اعضای گروه: امیرحسین ندایی پور، علی مهربانی

## گزارش انجام روال گفته شده روی پروژه CodeCoverageProject

در ابتدای این بخش روی پوشه test/java کلیک راست می‌کنیم و از منو، Run All Tests with Coverage را انتخاب می‌کنیم. در تصویر زیر می‌بینید که همه تست‌ها پاس می‌شوند و همچنین اعداد پوشش آزمون با توجه به پوشش کلاس‌ها، متدها و یا خط‌ها قابل مشاهده اند:

<img width="960" alt="pic1" src="https://github.com/nedaei79/SEL-Week7/assets/62210316/54839a8a-d505-47b7-b9d6-1012ee35cd83">

سپس گزینه Generate Coverage Report را انتخاب می‌کنیم و خروجی html زیر را مشاهده می‌کنیم:

![image](https://github.com/nedaei79/SEL-Week7/assets/62210316/459dfd1a-8d00-40f1-8a0a-6d306d9676e0)

مشابه آنچه در روال توضیح داده شده دیدیم، با انتخاب هر کلاس، خطوط پوشش داده شده و پوشش داده نشده با رنگ‌های سبز و قرمز مشخص می‌شوند:

![image](https://github.com/nedaei79/SEL-Week7/assets/62210316/7450c5bf-cc12-405a-ab19-1becde6ac441)

## بهبود اعداد پوشش آزمون

### بهبود پوشش کلاس‌های PersonServiceImpl و PersonException و PersonValidator

برای افزایش پوشش هر سه کلاس برای متد get در کلاس PersonServiceImpl یک تست می‌نویسیم:

![image](https://github.com/nedaei79/SEL-Week7/assets/62210316/6838cb7c-a67d-46dd-97d9-3b4011572e0b)

مشاهده می‌کنیم که متد عملکرد مد نظر را ندارد و تست Fail می‌شود. علت این است که در شرط موجود در متد get، استثنا به شرطی پرتاب می‌شود که validation درست باشد! یعنی برعکس چیزی که انتظار داریم:

![image](https://github.com/nedaei79/SEL-Week7/assets/62210316/7defe536-866f-43d7-991f-262d27399d0d)

برای پاس کردن این تست، شرط را تغییر می‌دهیم تا تنها در صورتی که validation غلط بود استثنا پرتاب شود:

![image](https://github.com/nedaei79/SEL-Week7/assets/62210316/bfde9139-3666-4977-a1e0-b383c7d1839d)

حالا مشاهده می‌کنیم که تست پاس می‌شود:

![image](https://github.com/nedaei79/SEL-Week7/assets/62210316/eeec8283-a51f-4bcf-a86d-6729a8baf1f3)

و اعداد پوشش برای کلاس PersonValidator از 80 درصد متدها به 100 درصد متدها و برای کلاس PersonException از 60 درصد خط‌‌ها به 100 درصد خط‌ها و برای کلاس PersonServiceImpl از 40 درصد متدها به 60 درصد متدها افزایش یافت:

![image](https://github.com/nedaei79/SEL-Week7/assets/62210316/f31944c4-83f8-4841-b9f3-19ac2508387b)

### بهبود پوشش کلاس‌های Traffic و StreetDirectionFlow

برای افزایش پوشش هر دو کلاس برای بررسی عملکرد متدهای getter و setter در کلاس Traffic یک تست می‌نویسیم:

![image](https://github.com/nedaei79/SEL-Week7/assets/62210316/a1bc5ce7-2036-4f33-872b-4504c9ad3317)

با اجرای تست‌ها می‌بینیم که اعداد پوشش برای کلاس StreetDirectionFlow از 0 درصد خطوط به 100 درصد خطوط و برای کلاس Traffic از 27.3 درصد متدها به 40 درصد متدها افزایش می‌یابد:

![image](https://github.com/nedaei79/SEL-Week7/assets/62210316/33d07df7-6591-44ab-9796-dc51147e62a5)

