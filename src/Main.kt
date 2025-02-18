enum class UserRole(val accessLevel: Int) {
    ADMIN(3),
    EDITOR(2),
    VIEWER(1)
}

fun hasAccess(role: UserRole, requiredAccessLevel: Int): Boolean {
    return role.accessLevel >= requiredAccessLevel
}

fun main() {
    val admin = UserRole.ADMIN
    val editor = UserRole.EDITOR
    val viewer = UserRole.VIEWER

    println("Admin has access for level 2: ${hasAccess(admin, 2)}")
    println("Editor has access for level 3: ${hasAccess(editor, 3)}")
    println("Viewer has access for level 1: ${hasAccess(viewer, 1)}")

    println("All User Roles:")
    for (role in UserRole.entries) {
        println("Role: ${role.name}, Access Level: ${role.accessLevel}")
    }
}
