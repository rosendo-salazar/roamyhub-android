package com.roamyhub.android.feature.profile.faq.data

/**
 * FAQ item data
 */
data class FaqItem(
    val id: String,
    val question: String,
    val answer: String,
    val category: String
)

/**
 * Hardcoded FAQ content
 */
object FaqData {
    val faqItems = listOf(
        FaqItem(
            id = "1",
            question = "What is an eSIM?",
            answer = "An eSIM (embedded SIM) is a digital SIM that allows you to activate a cellular plan without using a physical SIM card. It's built into your device and can be programmed remotely.",
            category = "Basics"
        ),
        FaqItem(
            id = "2",
            question = "How do I know if my device supports eSIM?",
            answer = "Most modern smartphones from iPhone XS/XR onwards, recent Samsung Galaxy devices, and Google Pixel 3 and later support eSIM. Check the Device Compatibility section in the app for a full list of compatible devices.",
            category = "Compatibility"
        ),
        FaqItem(
            id = "3",
            question = "How do I install my eSIM?",
            answer = "After purchasing, you'll receive a QR code. On iPhone: Go to Settings > Cellular > Add Cellular Plan and scan the QR code. On Android: Go to Settings > Network & Internet > Mobile network > Advanced > Carrier > Add carrier and scan the QR code.",
            category = "Installation"
        ),
        FaqItem(
            id = "4",
            question = "Can I use multiple eSIMs on my device?",
            answer = "Yes! Most eSIM-compatible devices can store multiple eSIM profiles. However, typically only one or two can be active at the same time, depending on your device model.",
            category = "Basics"
        ),
        FaqItem(
            id = "5",
            question = "When should I activate my eSIM?",
            answer = "We recommend activating your eSIM when you arrive at your destination. The validity period starts as soon as the eSIM connects to a network in the coverage area.",
            category = "Installation"
        ),
        FaqItem(
            id = "6",
            question = "How do I check my data usage?",
            answer = "You can check your remaining data in the My eSIMs section of the app. The data usage updates every few minutes when you're connected to the network.",
            category = "Usage"
        ),
        FaqItem(
            id = "7",
            question = "What happens when my data runs out?",
            answer = "When your data is depleted, you'll lose mobile data connectivity. You can purchase a top-up or a new plan directly in the app to continue using mobile data.",
            category = "Usage"
        ),
        FaqItem(
            id = "8",
            question = "Can I make phone calls with my eSIM?",
            answer = "Most of our eSIM plans are data-only. However, you can use data-based calling apps like WhatsApp, FaceTime, Skype, or other VoIP services to make calls.",
            category = "Usage"
        ),
        FaqItem(
            id = "9",
            question = "Will my eSIM work on cruise ships?",
            answer = "eSIMs work on land-based cellular networks. On cruise ships, you'll need to use the ship's Wi-Fi or maritime network, which is separate from our eSIM service.",
            category = "Coverage"
        ),
        FaqItem(
            id = "10",
            question = "Can I use my eSIM as a hotspot?",
            answer = "Yes, most eSIM plans support mobile hotspot/tethering. You can share your eSIM's data connection with other devices through your phone's hotspot feature.",
            category = "Usage"
        ),
        FaqItem(
            id = "11",
            question = "What if my eSIM isn't connecting?",
            answer = "First, ensure you're in a covered area and that mobile data is turned on for your eSIM. Try toggling airplane mode on and off, or restart your device. If issues persist, contact our support team.",
            category = "Troubleshooting"
        ),
        FaqItem(
            id = "12",
            question = "Can I get a refund if I haven't used my eSIM?",
            answer = "Refunds are available for unused, uninstalled eSIMs within 7 days of purchase. Once an eSIM has been installed or activated, it cannot be refunded.",
            category = "Billing"
        ),
        FaqItem(
            id = "13",
            question = "How do I earn and use RoamyHub points?",
            answer = "You earn 5 points for every dollar spent on eSIM purchases. Points can be redeemed on future purchases at checkout. 100 points = $1 off your order.",
            category = "Rewards"
        ),
        FaqItem(
            id = "14",
            question = "Is my data secure when using an eSIM?",
            answer = "Yes, eSIMs use the same security standards as physical SIM cards. Your data traffic is secured through cellular network encryption. For additional security, consider using a VPN.",
            category = "Security"
        ),
        FaqItem(
            id = "15",
            question = "Can I delete an eSIM from my device?",
            answer = "Yes, you can remove eSIM profiles from your device at any time through your device settings. Note that deleting an eSIM profile will permanently remove it from your device.",
            category = "Installation"
        )
    )

    /**
     * Get FAQs grouped by category
     */
    val faqsByCategory: Map<String, List<FaqItem>>
        get() = faqItems.groupBy { it.category }
}
