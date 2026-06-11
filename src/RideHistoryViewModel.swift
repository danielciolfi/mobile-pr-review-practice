import SwiftUI

@MainActor
final class RideHistoryViewModel: ObservableObject {
    @Published var rides: [Ride] = []
    @Published var isLoading = false

    private let rideRepository: RideRepository

    init(rideRepository: RideRepository) {
        self.rideRepository = rideRepository
    }

    func loadRides() async {
        isLoading = true
        defer { isLoading = false }
        rides = (try? await rideRepository.recentRides()) ?? []
    }
}