class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextValue;
	public PeekingIterator(Iterator<Integer> iterator) {
	    this.iterator = iterator;
        nextValue = iterator.hasNext() ? iterator.next() : null;
	}
	
	public Integer peek() {
        return nextValue;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer current = nextValue;
        nextValue = iterator.hasNext() ? iterator.next() : null;
        return current;
	}
	
	@Override
	public boolean hasNext() {
        return nextValue!=null;
	}
}