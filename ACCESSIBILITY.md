# Accessibility Guidelines for RoamyHub Android

This document outlines accessibility best practices and requirements for the RoamyHub Android app.

## General Principles

- **Perceivable**: Information and UI components must be presentable to users in ways they can perceive
- **Operable**: UI components and navigation must be operable
- **Understandable**: Information and UI operation must be understandable
- **Robust**: Content must be robust enough to be interpreted by a wide variety of user agents

## Checklist

### Content Description

- [ ] All images have meaningful `contentDescription` attributes
- [ ] Decorative images use `contentDescription = null` to hide them from screen readers
- [ ] All icons have descriptive content descriptions
- [ ] Interactive images clearly describe their action (e.g., "Delete item" not just "Delete icon")

### Touch Targets

- [ ] Minimum touch target size: **48dp x 48dp** (Material Design guidelines)
- [ ] Adequate spacing between interactive elements
- [ ] Use `Modifier.minimumInteractiveComponentSize()` for small buttons/icons

### Color and Contrast

- [ ] Text color contrast ratio: **4.5:1 minimum** for normal text
- [ ] Large text color contrast ratio: **3:1 minimum** for 18pt+ or 14pt+ bold
- [ ] Do not rely on color alone to convey information
- [ ] Support both light and dark themes
- [ ] Test with color blindness simulators

### Text

- [ ] Support dynamic text sizing (user's system font size preferences)
- [ ] Text remains readable when scaled to 200%
- [ ] Avoid hardcoded text sizes where possible
- [ ] Use Material Typography scales

### TalkBack Support

- [ ] Test all screens with TalkBack enabled
- [ ] Ensure logical reading order (top to bottom, left to right)
- [ ] Group related elements using `Modifier.semantics { }`
- [ ] Provide custom actions for complex gestures
- [ ] Announce important state changes

### Semantic Labels

- [ ] All interactive elements have meaningful semantic labels
- [ ] Button labels describe the action (e.g., "Add to cart" not just "Add")
- [ ] Form fields have clear labels and hints
- [ ] Error messages are announced to screen readers

### State Descriptions

- [ ] Dynamic content announces state changes
- [ ] Loading states are communicated
- [ ] Error states are clearly announced
- [ ] Success confirmations are accessible

### Focus Management

- [ ] Focus follows logical flow
- [ ] Custom focus indicators are visible
- [ ] Modal dialogs trap focus appropriately
- [ ] Focus returns to appropriate element after dialog dismissal

### Forms and Input

- [ ] All form fields have labels
- [ ] Error messages are associated with their fields
- [ ] Required fields are clearly marked
- [ ] Input types are appropriate (email, phone, etc.)
- [ ] Autocomplete attributes where applicable

### Navigation

- [ ] Navigation is keyboard-accessible (external keyboard support)
- [ ] Bottom navigation items have clear labels
- [ ] Back button behavior is predictable
- [ ] Skip links for long lists when appropriate

### Media

- [ ] Images have alt text
- [ ] Videos have captions (if applicable)
- [ ] Audio descriptions available (if applicable)

### Notifications

- [ ] Notifications are accessible
- [ ] Important notifications use appropriate importance levels
- [ ] Notification content is clear and concise

## Implementation Examples

### Image with Content Description

```kotlin
Image(
    painter = painterResource(id = R.drawable.plan_icon),
    contentDescription = "Data plan for United States",
    modifier = Modifier.size(48.dp)
)
```

### Button with Semantic Label

```kotlin
IconButton(
    onClick = { /* delete */ },
    modifier = Modifier.semantics { contentDescription = "Delete plan from favorites" }
) {
    Icon(Icons.Default.Delete, contentDescription = null)
}
```

### State Description for Dynamic Content

```kotlin
Text(
    text = "5 items in cart",
    modifier = Modifier.semantics {
        stateDescription = "Shopping cart contains 5 items"
    }
)
```

### Minimum Touch Target

```kotlin
Icon(
    imageVector = Icons.Default.Info,
    contentDescription = "More information",
    modifier = Modifier
        .size(24.dp)
        .minimumInteractiveComponentSize() // Ensures 48dp touch target
        .clickable { /* action */ }
)
```

### Grouped Semantics

```kotlin
Row(
    modifier = Modifier.semantics(mergeDescendants = true) {
        contentDescription = "United States plan, 5GB data, $25"
    }
) {
    Image(...)
    Column {
        Text("United States")
        Text("5GB")
        Text("$25")
    }
}
```

## Testing Tools

1. **Accessibility Scanner** (Google Play Store)
   - Scan all screens for common accessibility issues
   - Run before each release

2. **TalkBack**
   - Enable: Settings > Accessibility > TalkBack
   - Test all user flows with TalkBack enabled
   - Ensure announcements are clear and helpful

3. **Switch Access**
   - Test navigation using only external switches
   - Verify all interactive elements are reachable

4. **Font Size**
   - Test with largest system font size
   - Ensure text doesn't truncate or overlap

5. **Color Contrast Analyzers**
   - WebAIM Contrast Checker
   - Material Design Color Tool
   - WCAG Contrast Ratio

## Resources

- [Android Accessibility Documentation](https://developer.android.com/guide/topics/ui/accessibility)
- [Jetpack Compose Accessibility](https://developer.android.com/jetpack/compose/accessibility)
- [Material Design Accessibility](https://m3.material.io/foundations/accessible-design/overview)
- [WCAG 2.1 Guidelines](https://www.w3.org/WAI/WCAG21/quickref/)

## Accessibility Review Cadence

- [ ] Review accessibility before each release
- [ ] Test with TalkBack monthly
- [ ] Run Accessibility Scanner before each beta release
- [ ] Conduct user testing with users who use assistive technologies
- [ ] Monitor crash reports for accessibility-related issues

## Common Issues to Avoid

1. **Missing Content Descriptions**: Always provide meaningful descriptions for images and icons
2. **Small Touch Targets**: Ensure all interactive elements are at least 48dp
3. **Poor Contrast**: Test color combinations with contrast checkers
4. **Hardcoded Text Sizes**: Use Material Typography scales to support dynamic text sizing
5. **Complex Gestures**: Provide alternative interactions for users with motor impairments
6. **Time-Limited Actions**: Avoid auto-advancing content or time-limited interactions
7. **Flashing Content**: Avoid content that flashes more than 3 times per second
8. **Audio-Only Content**: Provide text alternatives for audio content

## Reporting Accessibility Issues

If you discover an accessibility issue:

1. File a bug with the "accessibility" label
2. Include:
   - Device and Android version
   - Assistive technology used (TalkBack, Switch Access, etc.)
   - Steps to reproduce
   - Expected behavior
   - Actual behavior
3. Assign priority based on impact:
   - **P0**: Blocks access to core functionality
   - **P1**: Significantly impacts user experience
   - **P2**: Minor inconvenience
   - **P3**: Nice to have improvement
