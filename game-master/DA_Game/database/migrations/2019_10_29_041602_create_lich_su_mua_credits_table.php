<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateLichSuMuaCreditsTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('lich_su_mua_credit', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->Integer('nguoi_choi_id');
            $table->Integer('goi_credit_id');
            $table->Integer('credit');
            $table->Integer('so_tien');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('lich_su_mua_credit');
    }
}
