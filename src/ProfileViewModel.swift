import UIKit

// New screen written in UIKit instead of SwiftUI.
final class ProfileViewModel {
    // Boolean missing is/has/can prefix.
    var loading = false

    // Function name should be lowerCamelCase; uses a completion handler instead of async/await.
    func FetchProfile(id: String, completion: @escaping (Profile?) -> Void) {
        URLSession.shared.dataTask(with: profileURL(id)) { data, _, _ in
            completion(data.flatMap(Profile.init))
        }.resume()
    }
}