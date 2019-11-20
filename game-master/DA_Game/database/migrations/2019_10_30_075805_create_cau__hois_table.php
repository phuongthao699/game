<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateCauHoisTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('cau_hoi', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->text('noi_dung');
            $table->unsignedInteger('linh_vuc_id');
            $table->String('phuong_an_a');
            $table->String('phuong_an_b');
            $table->String('phuong_an_c');
            $table->String('phuong_an_d');
            $table->String('dap_an');
            $table->softDeletes();
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
        Schema::dropIfExists('cau_hoi');
    }
}
