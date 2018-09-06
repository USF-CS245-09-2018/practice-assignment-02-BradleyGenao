class BinaryRecursiveSearch implements Practice2Search {
	@Override
	public String searchName() {

		return "Binary Recursive";

	}


	@Override
	public int search(int[] arr, int target) {
		int start = arr[0];
		int end = arr[arr.length-1];

		int middle = (start + end) / 2;

		if (end < start) {
			return -1;
		}


		if (target < arr[middle]) {
			return search(arr, target);
		}

		if (target > arr[middle]) {
			return search(arr, target);
		}

		if (target == arr[middle]) {
			return middle;
		}

		return -1;

	}
}