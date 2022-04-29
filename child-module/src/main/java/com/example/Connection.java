package com.example;

import org.apache.arrow.memory.BufferAllocator;
import org.apache.arrow.memory.RootAllocator;

public class Connection {

    private class ArrowRowReader
            implements AutoCloseable { // TODO: Update to recent version of Arrow to avoid memoryleak

        BufferAllocator allocator = new RootAllocator(Long.MAX_VALUE);

        private ArrowRowReader(){}

        @Override
        public void close() throws Exception {
            allocator.close();
        }
    }

    String highThroughPutRead(String myName) {
        // deserialize and populate the buffer async, so that the client isn't blocked
      processArrowStreamAsync(new ArrowRowReader());
      return "High Through Put Read";
    }

    ArrowRowReader processArrowStreamAsync(ArrowRowReader arrowRowReader) {
        // deserialize and populate the buffer async, so that the client isn't blocked
        return arrowRowReader;
    }
}
