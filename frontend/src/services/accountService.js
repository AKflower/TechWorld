import axios from 'axios';

const API_URL = 'http://localhost:8081/api';

const getUserInfo = async (userName) => {
    try {
        const response = await axios.get(`${API_URL}/info`, {
            params: { userName }
        });
        return response.data;
    } catch (error) {
        console.error('Error fetching user info:', error);
        throw error;
    }
};

const insertUser = async (taikhoan) => {
    try {
        const response = await axios.post(`${API_URL}/insertUser`, taikhoan);
        return response.data;
    } catch (error) {
        console.error('Error inserting user:', error);
        throw error;
    }
};

const accountService = {
    getUserInfo,
    insertUser
};

export default accountService;
