/*******************************************************************************
 * Copyright  2015 rzorzorzo@users.sf.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.rzo.netty.ahessian.auth;

import java.util.Arrays;

public class ByteArrayWrapper
{

	private final byte[] data;

	public ByteArrayWrapper(byte[] data)
	{
		if (data == null)
		{
			throw new NullPointerException();
		}
		this.data = data;
	}

	@Override
	public boolean equals(Object other)
	{
		if (!(other instanceof ByteArrayWrapper))
		{
			return false;
		}
		return Arrays.equals(data, ((ByteArrayWrapper) other).data);
	}

	@Override
	public int hashCode()
	{
		return Arrays.hashCode(data);
	}

}
