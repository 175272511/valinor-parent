package com.ninesale.valinor.apiserver.web.model.config;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

public class GetConfigResponse extends ClientBasicResponse {
	/**
	 * 配置内容
	 * 
	 * @author hawk
	 *
	 */
	public static class ConfigData {
		private Object key;
		private Object value;

		public ConfigData(Object key, Object value) {
			this.key = key;
			this.value = value;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof ConfigData)) {
				return false;
			}
			ConfigData other = (ConfigData) obj;
			if (key == null) {
				if (other.key != null) {
					return false;
				}
			}
			else if (!key.equals(other.key)) {
				return false;
			}
			if (value == null) {
				if (other.value != null) {
					return false;
				}
			}
			else if (!value.equals(other.value)) {
				return false;
			}
			return true;
		}

		/**
		 * @return the key
		 */
		public Object getKey() {
			return key;
		}

		/**
		 * @return the value
		 */
		public Object getValue() {
			return value;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}

		/**
		 * @param key
		 *            the key to set
		 */
		public void setKey(Object key) {
			this.key = key;
		}

		/**
		 * @param value
		 *            the value to set
		 */
		public void setValue(Object value) {
			this.value = value;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("ConfigData [key=");
			builder.append(key);
			builder.append(", value=");
			builder.append(value);
			builder.append("]");
			return builder.toString();
		}

	}

	private Map<String, List<ConfigData>> data;

	/**
	 * @return the data
	 */
	public Map<String, List<ConfigData>> getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Map<String, List<ConfigData>> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
