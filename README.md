# SSC Expense Tracker 📱💰
**Mobile Programming (CACS351) - BCA Practical Coursework**

Welcome to the **Expense Tracker** Android application repository! This project is designed specifically for bachelor-level computer science / IT students (BCA) learning Android development. It demonstrates practical implementation of Android programming concepts step-by-step across **10 structured labs** following the CACS351 syllabus.

---

## 📚 Syllabus & 10-Lab Curriculum Structure

| Lab | Unit | Topic Covered | Key Concepts & Components |
| :--- | :--- | :--- | :--- |
| **Lab 1** | Unit 2 | Project Setup & View Hierarchy | Android Platform, SDK setup, `ConstraintLayout`, Widget Attributes, String Resources, `MainActivity`, Toasts. |
| **Lab 2** | Unit 3 | Layout Types & Basic Widgets | Linear, Relative & Constraint Layouts, `TextView`, `EditText`, Input validation for Add Expense form. |
| **Lab 3** | Unit 3 | Advanced Widgets & Event Handling | `CheckBox`, `RadioButton`, `Spinner` (Category selection), Click listeners, Event handling. |
| **Lab 4** | Unit 4 | Activity Lifecycle & Multiple Activities | Activity Lifecycle states (`onCreate`, `onStart`, `onResume`, etc.), Intent navigation between Dashboard & Add Expense. |
| **Lab 5** | Unit 4 | Intents, Passing Data & Getting Results | Explicit Intents, Bundles, `putExtra`, `startActivityForResult` / `ActivityResultLauncher` for returning expense results. |
| **Lab 6** | Unit 5 | Fragments & FragmentManager | Fragment lifecycle, Fragment transactions, Bottom Navigation / TabLayout for Dashboard, Expenses, and Settings. |
| **Lab 7** | Unit 5 | Menus, Dialogs & Custom Dialogs | Options Menu, Context Menu, `AlertDialog`, Custom Dialog layout for editing expense entries. |
| **Lab 8** | Unit 6 | RecyclerView, Adapters & ViewHolders | `RecyclerView`, `CardView`, Custom Adapter, ViewHolder pattern, `LinearLayoutManager`, GridView/ListView comparison. |
| **Lab 9** | Unit 7 | SQLite Database (CRUD Operations) | `SQLiteOpenHelper`, Cursor, Insert, Read, Update, Delete transactions for offline local expense storage. |
| **Lab 10** | Unit 7 | API Integration, JSON Parsing & Maps | REST API integration (`HttpURLConnection` / Retrofit), `JSONObject` parsing, Google Maps marker integration, App Publishing guide. |

---

## 🛠️ Rules & Guidelines for Code Generation
1. **Java Only**: Written strictly in Java (no Kotlin).
2. **XML Layouts**: Using native XML view layouts (no Jetpack Compose).
3. **Beginner-Friendly**: Extensive inline comments explaining every concept.
4. **Clean Code**: Standard Android conventions, Material Design components (`MaterialCardView`, `MaterialButton`), and robust error handling.
5. **Progressive**: Each lab builds upon the previous lab's codebase.

---

## 🚀 Getting Started

1. **Prerequisites**:
   - Android Studio (Koala / Iguana or newer recommended)
   - Android SDK (API Level 24 to 34+)
   - Android Emulator or physical Android device with USB Debugging enabled.

2. **Opening the Project**:
   - Clone or open this repository folder in Android Studio.
   - Allow Gradle sync to complete.

3. **Running the App**:
   - Select the `:app` run configuration.
   - Click the **Run ' ▶ '** button in Android Studio to launch the app on your emulator or device.

---

## 👨‍🏫 Instructor / Student Notes
- **Lab 1 Code**: Located in [`app/src/main/java/com/example/sscexpensetracker/MainActivity.java`](app/src/main/java/com/example/sscexpensetracker/MainActivity.java) and [`app/src/main/res/layout/activity_main.xml`](app/src/main/res/layout/activity_main.xml).
- Feel free to explore branches or commit history as labs progress throughout the semester!
