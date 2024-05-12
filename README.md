# AutoSliderOnClickActivity

AutoSliderOnClickActivity ek Android app hai jo dikhata hai kis tarah se auto-scrolling tasweer kaarusal ko implement kia ja sakta hai jahan pe clickable items mojood hote hain. Yeh ViewPager2 ko image sliding ke liye aur RecyclerView ko tasweerain titles ke saath dikhane ke liye istemal karta hai. Tasweer pe click karne se mutabiq activity khulti hai.

## Functions

### ImageItem

```kotlin
data class ImageItem(val imageResId: Int, val title: String)


It seems you've provided code for an Android app that implements an auto-sliding image carousel with clickable items. Here's a breakdown of what each part does:

ImageItem: A data class representing an image item with its resource ID and title.

ImageSliderAdapter: An adapter for the RecyclerView to display the list of images with their titles. It also handles item click events.

AutoScrollViewPager: A class to automate the sliding of ViewPager2 to create an auto-scrolling effect.

ImageDataProvider: A helper class that sets up the ViewPager2, TabLayout, and handles item clicks. It also manages the auto-scrolling functionality.

MainActivity: The main activity class that sets up the layout and initializes the ImageDataProvider.

activity_main.xml: Layout XML file defining the main activity layout with a ViewPager2 and TabLayout.

image_slider_item.xml: Layout XML file defining the item layout for the RecyclerView in the slider.

Colors and Drawables: Additional resources used in the layout files.

Open the project in Android Studio and run it on an emulator or a physical device.

## Usage
Upon launching the app, you'll see a horizontally scrolling carousel of images with titles.
Images automatically scroll every 3 seconds (configurable) or you can swipe manually.
Clicking on an image opens a corresponding activity. Currently, there are three activities (Activity1, Activity2, Activity3) mapped to the first three images.
Contributing
Contributions are welcome! Feel free to open issues or submit pull requests for any improvements or bug fixes.

## License
This project is licensed under the MIT License.

imageResId: Integer value representing the resource ID of the image.
title: String representing the title of the image.
ImageSliderAdapter
kotlin
Copy code
## class ImageSliderAdapter(
    private val imageList: List<ImageItem>,
    private val onItemClick: (Int) -> Unit
) : RecyclerView.Adapter<ImageSliderAdapter.ImageViewHolder>()
imageList: List of ImageItem objects representing the images to be displayed.
onItemClick: Lambda function to handle item click events.
## AutoScrollViewPager
kotlin
Copy code
class AutoScrollViewPager(
    private val viewPager: ViewPager2,
    private val interval: Long = 4000 // 3 seconds
)
viewPager: ViewPager2 object to be scrolled automatically.
interval: Long value representing the interval between automatic scrolls (default is 3 seconds).
## ImageDataProvider
kotlin
Copy code
class ImageDataProvider(
    private val context: Context,
    private val viewPager: ViewPager2,
    private val tabLayout: TabLayout
)
context: Context object representing the current application context.
viewPager: ViewPager2 object for displaying images.
tabLayout: TabLayout object for displaying tabs.
## MainActivity
kotlin
Copy code
class MainActivity : AppCompatActivity()
Main activity class responsible for setting up the layout and initializing the ImageDataProvider.
Installation
Repository ko apne local machine pe clone karein:

## bash
Copy code
git clone https://github.com/bukharisha/AutoSliderOnClickActivity
Project ko Android Studio mein kholen aur use ek emulator ya physical device pe run karein.

## Usage
App ko launch karne par, aap tasweeron ke titles ke saath ek horizontal carousel dekhenge.
Tasweerain automatically har 3 seconds mein scroll hoti hain (configureable) ya aap manually swipe kar sakte hain.
Kisi tasweer pe click karne se mutabiq activity khulti hai. Abhi, pehli teen tasweeron ke liye teen activities (Activity1, Activity2, Activity3) assign ki gayi hain.
Contributing
Contributions khush aamdeed hain! Kisi bhi behtari ya bug fix ke liye issues open karne ya pull requests submit karne ke liye bilkul azad hain.

## License
Yeh project MIT License ke teht licensed hai.
