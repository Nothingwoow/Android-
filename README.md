# **NotePad 应用**

## 一、基本功能
- **NoteList界面中笔记条目增加时间戳显示**
- **添加笔记查询功能**（根据标题或内容查询）

## 扩展功能
- **更改记事本背景**
- **按照笔记标题排序**

---

## 二、功能介绍

### 1. 笔记管理
- **新增笔记**：创建新的笔记，内容为空。
- **编辑笔记**：支持对已保存的笔记进行编辑。
- **删除笔记**：删除当前笔记。
- **取消更改**：编辑过程中可以取消更改，恢复到原始状态。
- **排序笔记**：点击排序按钮按标题对笔记进行升序或降序排序。

### 2. 笔记个性化设置
- **背景颜色设置**：用户可以为笔记设置背景颜色。
  支持 7 种颜色选择（红色、绿色、蓝色、黄色、青色、洋红、灰色）。
  设置的背景颜色会被保存并在下次打开时恢复。

### 3. 广播机制
- **实时更新**：每当笔记被保存或删除时，会发送广播通知其他组件，便于刷新笔记列表。

### 4. 搜索笔记
- 在搜索框中输入关键词，应用会根据标题内容实时过滤笔记，展示符合条件的笔记项。

---

## 三、基本功能展示

### • **NoteList界面中笔记条目增加时间戳显示**
![img1](app/src/main/java/com/example/android/notepad/img_readme/img1.png)

### • **添加笔记查询功能（根据标题或内容查询）**
![img2](app/src/main/java/com/example/android/notepad/img_readme/img2.png)

---

## 四、扩展功能展示

### • **更改记事本背景**

#### 1. 修改主页背景
![img3_1](app/src/main/java/com/example/android/notepad/img_readme/img3_1.png)
![img3_2](app/src/main/java/com/example/android/notepad/img_readme/img3_2.png)

#### 2. 修改笔记内部背景
![img3_3](app/src/main/java/com/example/android/notepad/img_readme/img3_3.png)
![img3_4](app/src/main/java/com/example/android/notepad/img_readme/img3_4.png)

### • **按照笔记标题排序**
![img4](app/src/main/java/com/example/android/notepad/img_readme/img4.png)

---

## 五、功能实现

### 1. **背景颜色设置，使用 SharedPreferences 实现背景颜色的保存和恢复**

#### 保存背景颜色：
```java
private void saveBackgroundColor(int color) {
    SharedPreferences preferences = getSharedPreferences("NoteSettings", MODE_PRIVATE);
    SharedPreferences.Editor editor = preferences.edit();
    editor.putInt("backgroundColor", color);
    editor.apply();
}
